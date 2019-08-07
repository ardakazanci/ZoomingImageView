package com.ardakazanci.zoomingimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity {

	ImageView sampleImageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		sampleImageView = findViewById(R.id.photo_view);

		PhotoViewAttacher photoViewAttacher = new PhotoViewAttacher(sampleImageView);
		photoViewAttacher.update();

	}
}
