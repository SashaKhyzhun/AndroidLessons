package com.khyzhun.sasha.criminalintent;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.view.Display;

/**
 * Created by User on 01.09.2015.
 */
public class PictureUtils {
    /**
     * Получение объекта в BitmapDrawable по даннім локального файла
     * масштабированного по текущим размерам окна
     */

    @SuppressWarnings("deprecation")
    public static BitmapDrawable setScaleDrawable(Activity a, String path) {
        Display display = a.getWindowManager().getDefaultDisplay();
        float destWidth = display.getWidth();
        float destHeight = display.getHeight();

        // Чтение размеров изображения на диске
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);

        int inSampleSize = 1;
        if (srcHeight > destHeight || srcW)


    }

}
