package sasha.khyzhun.com.photogallery;

import android.media.session.MediaSession;
import android.os.HandlerThread;
import android.util.Log;
import android.widget.ImageView;

/**
 * Created by Sasha on 08-Sep-15.
 */
public class ThumbnailDownloader<I> extends HandlerThread {

    private static final String TAG = "ThumbnailDownloader";

    public ThumbnailDownloader() {
        super(TAG);
    }

    public void queueThumbnail(ImageView token, String url) {
        Log.i(TAG, "Got an URL: " + url);
    }

}