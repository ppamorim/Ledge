package com.github.ppamorim.ledge;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

public class LedgeToolbar extends ShadowLayout {

  public LedgeToolbar(Context context) {
    this(context, null);
  }

  public LedgeToolbar(Context context, AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public LedgeToolbar(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }


  private Bitmap createShadowBitmap(int shadowWidth, int shadowHeight, float cornerRadius, int fillColor) {

    Bitmap output = Bitmap.createBitmap(shadowWidth, shadowHeight, Bitmap.Config.ALPHA_8);
    Canvas canvas = new Canvas(output);

    RectF shadowRect = new RectF(0, 0, shadowWidth, shadowHeight);

    Paint shadowPaint = new Paint();
    shadowPaint.setAntiAlias(true);
    shadowPaint.setColor(fillColor);
    shadowPaint.setStyle(Paint.Style.FILL);
    canvas.drawRoundRect(shadowRect, cornerRadius, cornerRadius, shadowPaint);
    return output;
  }

}
