package net.osmand.aidl.tiles;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class AMapTileBitmap implements Parcelable {

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

	public static final Creator<AMapTileBitmap> CREATOR = new
			Creator<AMapTileBitmap>() {
				public AMapTileBitmap createFromParcel(Parcel in) {
					return new AMapTileBitmap(in);
				}

				public AMapTileBitmap[] newArray(int size) {
					return new AMapTileBitmap[size];
				}
			};

	public void writeToParcel(Parcel out, int flags) {
		out.writeParcelable(bitmap, flags);
	}

	private void readFromParcel(Parcel in) {
		bitmap = in.readParcelable(Bitmap.class.getClassLoader());
	}

	public int describeContents() {
		return 0;
	}
}
