package sasha.khyzhun.com.photogallery;

import android.media.session.MediaSession;
import android.os.HandlerThread;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;

/**
 * Created by Sasha on 08-Sep-15.
 */
public class ThumbnailDownloader extends HandlerThread {

    private static final String TAG = "ThumbnailDownloader";

    public ThumbnailDownloader() {
        super(TAG);
    }

    public void queueThumbnail(MediaSession.Token token, String url) {
        Log.i(TAG, "Got an URL: " + url);
    }

}