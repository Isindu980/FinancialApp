// Generated by view binder compiler. Do not edit!
package com.example.financialapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.financialapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button buttonLogin;

  @NonNull
  public final Button buttonSignup;

  @NonNull
  public final CheckBox checkBoxRememberMe;

  @NonNull
  public final EditText editTextEmail;

  @NonNull
  public final EditText editTextPassword;

  private ActivityLoginBinding(@NonNull RelativeLayout rootView, @NonNull Button buttonLogin,
      @NonNull Button buttonSignup, @NonNull CheckBox checkBoxRememberMe,
      @NonNull EditText editTextEmail, @NonNull EditText editTextPassword) {
    this.rootView = rootView;
    this.buttonLogin = buttonLogin;
    this.buttonSignup = buttonSignup;
    this.checkBoxRememberMe = checkBoxRememberMe;
    this.editTextEmail = editTextEmail;
    this.editTextPassword = editTextPassword;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonLogin;
      Button buttonLogin = ViewBindings.findChildViewById(rootView, id);
      if (buttonLogin == null) {
        break missingId;
      }

      id = R.id.buttonSignup;
      Button buttonSignup = ViewBindings.findChildViewById(rootView, id);
      if (buttonSignup == null) {
        break missingId;
      }

      id = R.id.checkBoxRememberMe;
      CheckBox checkBoxRememberMe = ViewBindings.findChildViewById(rootView, id);
      if (checkBoxRememberMe == null) {
        break missingId;
      }

      id = R.id.editTextEmail;
      EditText editTextEmail = ViewBindings.findChildViewById(rootView, id);
      if (editTextEmail == null) {
        break missingId;
      }

      id = R.id.editTextPassword;
      EditText editTextPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextPassword == null) {
        break missingId;
      }

      return new ActivityLoginBinding((RelativeLayout) rootView, buttonLogin, buttonSignup,
          checkBoxRememberMe, editTextEmail, editTextPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
