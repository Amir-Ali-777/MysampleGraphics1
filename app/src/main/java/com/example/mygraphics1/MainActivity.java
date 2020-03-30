package com.example.mygraphics1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ourView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        draw();

        setContentView(ourView);
    }
        public void draw(){

            Bitmap blankBitmap;

            blankBitmap = Bitmap.createBitmap(600,600,Bitmap.Config.ARGB_8888);

            Canvas canvas;

            canvas = new Canvas(blankBitmap);

            ourView = new ImageView(this);

            ourView.setImageBitmap(blankBitmap);

            Paint paint;

            paint = new Paint();

            canvas.drawColor(Color.argb(255, 255, 255, 255));

            paint.setColor(Color.argb(255,  26, 128, 182));

            Bitmap bitmapBob;

            bitmapBob = BitmapFactory.decodeResource(this.getResources(), R.drawable.batman);

            canvas.drawBitmap(bitmapBob, 100, 50, paint);

            canvas.drawLine(50,20,50,250,paint);

            paint.setColor(Color.argb(255,  246, 128, 182));

            canvas.drawText("BATMAN", 50, 50, paint);

            paint.setColor(Color.argb(255,  89, 128, 35));

            canvas.drawPoint(40,50,paint);

            canvas.drawCircle(510,50,40,paint);

            paint.setColor(Color.argb(55,  40, 129, 100));

            canvas.drawRect(50,450,500,550,paint);

    }
}
