package net.osmand.aidlapi.tiles;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;

import androidx.annotation.NonNull;

import net.osmand.aidlapi.AidlParams;

public class AMapTileBitmap extends AidlParams {

	private Bitmap bitmap;

	public AMapTileBitmap(@NonNull Bitmap bitmap) {
		this.bitmap = bitmap;
	}

	public AMapTileBitmap(Parcel in) {
		readFromParcel(in);
	}

	public Bitmap getBitmap() {
		return bitmap;
	}

	public static final Creator<AMapTileBitmap> CREATOR = new Creator<AMapTileBitmap>() {
		@Override
		public AMapTileBitmap createFromParcel(Parcel in) {
			return new AMapTileBitmap(in);
		}

		@Override
		public AMapTileBitmap[] newArray(int size) {
			return new AMapTileBitmap[size];
		}
	};

	@Override
	public void writeToBundle(Bundle bundle) {
		bundle.putParcelable("bitmap", bitmap);
	}

	@Override
	protected void readFromBundle(Bundle bundle) {
		bundle.setClassLoader(Bitmap.class.getClassLoader());
		bitmap = bundle.getParcelable("bitmap");
	}
}