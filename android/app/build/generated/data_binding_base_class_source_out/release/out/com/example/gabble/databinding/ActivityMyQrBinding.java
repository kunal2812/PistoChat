// Generated by view binder compiler. Do not edit!
package com.example.gabble.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.gabble.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMyQrBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView imageBack;

  @NonNull
  public final ImageView qrImage;

  @NonNull
  public final TextView textMessage;

  private ActivityMyQrBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView imageBack, @NonNull ImageView qrImage,
      @NonNull TextView textMessage) {
    this.rootView = rootView;
    this.imageBack = imageBack;
    this.qrImage = qrImage;
    this.textMessage = textMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMyQrBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMyQrBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_my_qr, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMyQrBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageBack;
      AppCompatImageView imageBack = ViewBindings.findChildViewById(rootView, id);
      if (imageBack == null) {
        break missingId;
      }

      id = R.id.qrImage;
      ImageView qrImage = ViewBindings.findChildViewById(rootView, id);
      if (qrImage == null) {
        break missingId;
      }

      id = R.id.textMessage;
      TextView textMessage = ViewBindings.findChildViewById(rootView, id);
      if (textMessage == null) {
        break missingId;
      }

      return new ActivityMyQrBinding((ConstraintLayout) rootView, imageBack, qrImage, textMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
