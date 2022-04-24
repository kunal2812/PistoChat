// Generated by view binder compiler. Do not edit!
package com.example.gabble.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.gabble.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityContactsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView contactsRecylerView;

  @NonNull
  public final AppCompatImageView imageBack;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textErrorMessage;

  private ActivityContactsBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView contactsRecylerView, @NonNull AppCompatImageView imageBack,
      @NonNull ProgressBar progressBar, @NonNull TextView textErrorMessage) {
    this.rootView = rootView;
    this.contactsRecylerView = contactsRecylerView;
    this.imageBack = imageBack;
    this.progressBar = progressBar;
    this.textErrorMessage = textErrorMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityContactsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityContactsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_contacts, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityContactsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.contactsRecylerView;
      RecyclerView contactsRecylerView = ViewBindings.findChildViewById(rootView, id);
      if (contactsRecylerView == null) {
        break missingId;
      }

      id = R.id.imageBack;
      AppCompatImageView imageBack = ViewBindings.findChildViewById(rootView, id);
      if (imageBack == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.textErrorMessage;
      TextView textErrorMessage = ViewBindings.findChildViewById(rootView, id);
      if (textErrorMessage == null) {
        break missingId;
      }

      return new ActivityContactsBinding((ConstraintLayout) rootView, contactsRecylerView,
          imageBack, progressBar, textErrorMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
