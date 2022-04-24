// Generated by view binder compiler. Do not edit!
package com.example.gabble.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.gabble.R;
import com.makeramen.roundedimageview.RoundedImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityReceiverProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView profileAbout;

  @NonNull
  public final AppCompatImageView profileDiscard;

  @NonNull
  public final RoundedImageView profileImage;

  @NonNull
  public final TextView profileName;

  @NonNull
  public final Button saveProfile;

  private ActivityReceiverProfileBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView profileAbout, @NonNull AppCompatImageView profileDiscard,
      @NonNull RoundedImageView profileImage, @NonNull TextView profileName,
      @NonNull Button saveProfile) {
    this.rootView = rootView;
    this.profileAbout = profileAbout;
    this.profileDiscard = profileDiscard;
    this.profileImage = profileImage;
    this.profileName = profileName;
    this.saveProfile = saveProfile;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityReceiverProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityReceiverProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_receiver_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityReceiverProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.profile_about;
      TextView profileAbout = ViewBindings.findChildViewById(rootView, id);
      if (profileAbout == null) {
        break missingId;
      }

      id = R.id.profileDiscard;
      AppCompatImageView profileDiscard = ViewBindings.findChildViewById(rootView, id);
      if (profileDiscard == null) {
        break missingId;
      }

      id = R.id.profile_image;
      RoundedImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.profile_name;
      TextView profileName = ViewBindings.findChildViewById(rootView, id);
      if (profileName == null) {
        break missingId;
      }

      id = R.id.save_profile;
      Button saveProfile = ViewBindings.findChildViewById(rootView, id);
      if (saveProfile == null) {
        break missingId;
      }

      return new ActivityReceiverProfileBinding((ConstraintLayout) rootView, profileAbout,
          profileDiscard, profileImage, profileName, saveProfile);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}