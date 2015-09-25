package sasha.khyzhun.com.photogallery;

/**
 * Created by Dima on 07-Sep-15.
 */
public class GalleryItem {

    private String mCaption;
    private String mId;
    private String mUrl;

    public String toString() {
        return mCaption;
    }


    /** List of Getters **/

    public String getmCaption() {
        return mCaption;
    }

    public String getmId() {
        return mId;
    }

    public String getmUrl() {
        return mUrl;
    }

    /** List of Setters **/

    public void setmCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

}
