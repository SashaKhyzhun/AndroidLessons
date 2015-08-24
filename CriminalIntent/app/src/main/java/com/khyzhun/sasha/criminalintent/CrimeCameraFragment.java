package com.khyzhun.sasha.criminalintent;

import android.annotation.TargetApi;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.io.IOException;
import java.util.List;

/**
 * Created by Sasha on 24.08.15.
 */
public class CrimeCameraFragment extends Fragment {

    private static final String TAG = "CrimeCameraFragment";
    private Camera mCamera;
    private SurfaceView mSurfaceView;


    @Override
    @SuppressWarnings("deprecation")
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime_camera, parent, false);
        Button takePictureButton = (Button)v.findViewById(R.id.crime_camera_takePictureButton);
        takePictureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });

        mSurfaceView = (SurfaceView)v.findViewById(R.id.crime_camera_surfaceView);
        SurfaceHolder holder = mSurfaceView.getHolder();
        // Метод setType() и константа SURFACE_TYPE_PUSH_BUFFERS считаются
        // устаревшими, но они необходимы для того, чтобы функция
        // предварительного просмотра изображения с камеры
        // Camera работала на устройствах до 3.0
        holder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);

        holder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                // Приказываем камере использовать указанную
                // поверхность как область предварительного просмотра
                try {
                    if (mCamera != null) {
                        mCamera.setPreviewDisplay(holder);
                    }
                } catch (IOException exception) {
                    Log.e(TAG, "Error setting up preview display", exception);
                }
            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
                // Дальнейший вывод на поверхности невозможен,
                // прекращаем предварительный просмотр.
                if (mCamera != null) {
                    mCamera.stopPreview();
                }
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {

                if (mCamera == null) return;

                // Размер поверхности изменился; обновить размер
                // области предварительноо просмотра камеры
                Camera.Parameters parameters = mCamera.getParameters();
                Size s = null; // TODO: 24.08.15 изменить!
                parameters.setPreviewSize(s.getWidth(), s.getHeight()); // TODO: 24.08.15 -get
                mCamera.setParameters(parameters);
                try {
                    mCamera.startPreview();
                } catch (Exception e) {
                    Log.e(TAG, "Could not start preview", e);
                    mCamera.release();
                    mCamera = null;
                }
            }
        });

        return v;
    }



    private Size getBestSupportedSize(List<Size> sizes, int width, int height) {
        // Алгоритм получения найбольшего доступного размера
        Size bestSize = sizes.get(0);
        int largestArea = bestSize.getWidth() * bestSize.getHeight();
        for (Size s : sizes) {
            int area = s.getWidth() * s.getHeight();
            if (area > largestArea) {
                bestSize = s;
                largestArea = area;
            }
        }
        return bestSize;

    }



    @TargetApi(9)
    @Override
    public void onResume() {
        super.onResume();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
            mCamera = Camera.open(0);
        } else {
            mCamera = Camera.open();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if(mCamera != null) {
            mCamera.release();
            mCamera = null;
        }
    }



}
