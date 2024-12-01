// Generated by view binder compiler. Do not edit!
package com.example.financialapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.financialapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CardItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView tvCardNumber;

  @NonNull
  public final TextView tvExpiryDate;

  @NonNull
  public final Button viewDetailsAndPaymentButton;

  private CardItemBinding(@NonNull LinearLayout rootView, @NonNull TextView tvCardNumber,
      @NonNull TextView tvExpiryDate, @NonNull Button viewDetailsAndPaymentButton) {
    this.rootView = rootView;
    this.tvCardNumber = tvCardNumber;
    this.tvExpiryDate = tvExpiryDate;
    this.viewDetailsAndPaymentButton = viewDetailsAndPaymentButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CardItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CardItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.card_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CardItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_card_number;
      TextView tvCardNumber = ViewBindings.findChildViewById(rootView, id);
      if (tvCardNumber == null) {
        break missingId;
      }

      id = R.id.tv_expiry_date;
      TextView tvExpiryDate = ViewBindings.findChildViewById(rootView, id);
      if (tvExpiryDate == null) {
        break missingId;
      }

      id = R.id.viewDetailsAndPaymentButton;
      Button viewDetailsAndPaymentButton = ViewBindings.findChildViewById(rootView, id);
      if (viewDetailsAndPaymentButton == null) {
        break missingId;
      }

      return new CardItemBinding((LinearLayout) rootView, tvCardNumber, tvExpiryDate,
          viewDetailsAndPaymentButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
