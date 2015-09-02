package com.khyzhun.sasha.criminalintent;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Sasha on 07.08.15.
 */
public class Crime {

    private UUID id;
    private String title;
    private Date discoveredOn;
    private boolean solved;
    private Photo mPhoto;
    private String mSuspect;

    private static final String JSON_ID = "id";
    private static final String JSON_TITLE = "title";
    private static final String JSON_DISCOVERED_ON = "discovered_on";
    private static final String JSON_SOLVED = "solved";
    private static final String JSON_PHOTO = "photo";
    private static final String JSON_SUSPECT = "suspect";

    public Crime() {
        id = UUID.randomUUID();
        discoveredOn = new Date();
    }

    public Crime(JSONObject json) throws JSONException {
        this.id = UUID.fromString(json.getString(JSON_ID));
        this.title = json.getString(JSON_TITLE);
        this.solved = json.getBoolean(JSON_SOLVED);
        this.discoveredOn = new Date(json.getLong(JSON_DISCOVERED_ON));
        this.mPhoto = new Photo(json.getJSONObject(JSON_PHOTO));
        this.mSuspect = json.getString(JSON_SUSPECT);
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(JSON_ID, this.id.toString());
        jsonObject.put(JSON_TITLE, this.title);
        jsonObject.put(JSON_SOLVED, this.solved);
        jsonObject.put(JSON_DISCOVERED_ON, this.discoveredOn.getTime());
        jsonObject.put(JSON_PHOTO, this.mPhoto);
        jsonObject.put(JSON_SUSPECT, this.mSuspect);


        return jsonObject;
    }

    @Override
    public String toString() {
        return title;
    }

    public boolean isSolved() {
        return solved;
    }


    /** List of Getter methods **/

    public Photo getPhoto() {
        return mPhoto;
    }

    public UUID getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Date getDiscoveredOn() {
        return discoveredOn;
    }

    public String getSuspect() {
        return mSuspect;
    }


    /** List of Setter **/
    public void setPhoto(Photo p) {
        mPhoto = p;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDiscoveredOn(Date discoveredOn) {
        this.discoveredOn = discoveredOn;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }
}
