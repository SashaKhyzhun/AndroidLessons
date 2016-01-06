package com.khyzhun.sasha.myasynctask;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    protected TextView textState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        textState = (TextView) findViewById(R.id.textState);
    }

    public void onProgressButton(View view) {
        new MyProgersBarAsyncTask().execute();
    }


    class MyProgersBarAsyncTask extends AsyncTask<Void, Integer, Void> {

        private int progresBarValue = 0;

        @Override
        protected void onPreExecute() {
            Toast.makeText(MainActivity.this, "Начало процесса", Toast.LENGTH_SHORT).show();
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            Toast.makeText(MainActivity.this, "Процесс окончен", Toast.LENGTH_SHORT).show();
            super.onPostExecute(aVoid);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            progressBar.setProgress(values[0]);
            textState.setText(values[0] + " %");
        }

        @Override
        protected Void doInBackground(Void... params) {
            while (progresBarValue < 100) {
                progresBarValue++;
                publishProgress(progresBarValue);
                SystemClock.sleep(200);
            }
            return null;
        }
    }
}
