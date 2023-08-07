// Generated by view binder compiler. Do not edit!
package com.example.b07project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.b07project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ShopperOrdersPreviewBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView shopperOrderId;

  @NonNull
  public final TextView shopperOrderIdText;

  @NonNull
  public final TextView shopperOrderNameText;

  @NonNull
  public final TextView shopperOrderQuantity;

  @NonNull
  public final TextView shopperOrderQuantityText;

  @NonNull
  public final TextView shopperOrderStatus;

  @NonNull
  public final TextView shopperOrderStatusText;

  @NonNull
  public final TextView shopperOrderTotal;

  @NonNull
  public final TextView shopperOrderTotalText;

  private ShopperOrdersPreviewBinding(@NonNull CardView rootView, @NonNull TextView shopperOrderId,
      @NonNull TextView shopperOrderIdText, @NonNull TextView shopperOrderNameText,
      @NonNull TextView shopperOrderQuantity, @NonNull TextView shopperOrderQuantityText,
      @NonNull TextView shopperOrderStatus, @NonNull TextView shopperOrderStatusText,
      @NonNull TextView shopperOrderTotal, @NonNull TextView shopperOrderTotalText) {
    this.rootView = rootView;
    this.shopperOrderId = shopperOrderId;
    this.shopperOrderIdText = shopperOrderIdText;
    this.shopperOrderNameText = shopperOrderNameText;
    this.shopperOrderQuantity = shopperOrderQuantity;
    this.shopperOrderQuantityText = shopperOrderQuantityText;
    this.shopperOrderStatus = shopperOrderStatus;
    this.shopperOrderStatusText = shopperOrderStatusText;
    this.shopperOrderTotal = shopperOrderTotal;
    this.shopperOrderTotalText = shopperOrderTotalText;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ShopperOrdersPreviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ShopperOrdersPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.shopper_orders_preview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ShopperOrdersPreviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.shopper_order_id;
      TextView shopperOrderId = ViewBindings.findChildViewById(rootView, id);
      if (shopperOrderId == null) {
        break missingId;
      }

      id = R.id.shopper_order_id_text;
      TextView shopperOrderIdText = ViewBindings.findChildViewById(rootView, id);
      if (shopperOrderIdText == null) {
        break missingId;
      }

      id = R.id.shopper_order_name_text;
      TextView shopperOrderNameText = ViewBindings.findChildViewById(rootView, id);
      if (shopperOrderNameText == null) {
        break missingId;
      }

      id = R.id.shopper_order_quantity;
      TextView shopperOrderQuantity = ViewBindings.findChildViewById(rootView, id);
      if (shopperOrderQuantity == null) {
        break missingId;
      }

      id = R.id.shopper_order_quantity_text;
      TextView shopperOrderQuantityText = ViewBindings.findChildViewById(rootView, id);
      if (shopperOrderQuantityText == null) {
        break missingId;
      }

      id = R.id.shopper_order_status;
      TextView shopperOrderStatus = ViewBindings.findChildViewById(rootView, id);
      if (shopperOrderStatus == null) {
        break missingId;
      }

      id = R.id.shopper_order_status_text;
      TextView shopperOrderStatusText = ViewBindings.findChildViewById(rootView, id);
      if (shopperOrderStatusText == null) {
        break missingId;
      }

      id = R.id.shopper_order_total;
      TextView shopperOrderTotal = ViewBindings.findChildViewById(rootView, id);
      if (shopperOrderTotal == null) {
        break missingId;
      }

      id = R.id.shopper_order_total_text;
      TextView shopperOrderTotalText = ViewBindings.findChildViewById(rootView, id);
      if (shopperOrderTotalText == null) {
        break missingId;
      }

      return new ShopperOrdersPreviewBinding((CardView) rootView, shopperOrderId,
          shopperOrderIdText, shopperOrderNameText, shopperOrderQuantity, shopperOrderQuantityText,
          shopperOrderStatus, shopperOrderStatusText, shopperOrderTotal, shopperOrderTotalText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
