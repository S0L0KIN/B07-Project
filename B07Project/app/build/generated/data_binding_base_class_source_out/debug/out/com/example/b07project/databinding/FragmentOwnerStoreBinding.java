// Generated by view binder compiler. Do not edit!
package com.example.b07project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.b07project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOwnerStoreBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button buttonAddItem;

  @NonNull
  public final EditText itemDescription;

  @NonNull
  public final EditText itemName;

  @NonNull
  public final EditText itemPrice;

  @NonNull
  public final TextView storeHeading;

  @NonNull
  public final TextView test;

  private FragmentOwnerStoreBinding(@NonNull RelativeLayout rootView, @NonNull Button buttonAddItem,
      @NonNull EditText itemDescription, @NonNull EditText itemName, @NonNull EditText itemPrice,
      @NonNull TextView storeHeading, @NonNull TextView test) {
    this.rootView = rootView;
    this.buttonAddItem = buttonAddItem;
    this.itemDescription = itemDescription;
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.storeHeading = storeHeading;
    this.test = test;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOwnerStoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOwnerStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_owner_store, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOwnerStoreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonAddItem;
      Button buttonAddItem = ViewBindings.findChildViewById(rootView, id);
      if (buttonAddItem == null) {
        break missingId;
      }

      id = R.id.itemDescription;
      EditText itemDescription = ViewBindings.findChildViewById(rootView, id);
      if (itemDescription == null) {
        break missingId;
      }

      id = R.id.itemName;
      EditText itemName = ViewBindings.findChildViewById(rootView, id);
      if (itemName == null) {
        break missingId;
      }

      id = R.id.itemPrice;
      EditText itemPrice = ViewBindings.findChildViewById(rootView, id);
      if (itemPrice == null) {
        break missingId;
      }

      id = R.id.storeHeading;
      TextView storeHeading = ViewBindings.findChildViewById(rootView, id);
      if (storeHeading == null) {
        break missingId;
      }

      id = R.id.test;
      TextView test = ViewBindings.findChildViewById(rootView, id);
      if (test == null) {
        break missingId;
      }

      return new FragmentOwnerStoreBinding((RelativeLayout) rootView, buttonAddItem,
          itemDescription, itemName, itemPrice, storeHeading, test);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}