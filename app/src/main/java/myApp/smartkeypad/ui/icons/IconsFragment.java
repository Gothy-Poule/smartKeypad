package myApp.smartkeypad.ui.icons;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import myApp.smartkeypad.R;

public class IconsFragment extends Fragment
{
    private IconsViewModel iconsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        iconsViewModel = ViewModelProviders.of(this).get(IconsViewModel.class);

        View root = inflater.inflate(R.layout.content_main, container, false);

        final TextView textView = root.findViewById(R.id.textView);

        iconsViewModel.getText().observe(this, new Observer<String>()
        {
            @Override
            public void onChanged(@Nullable String s)
            {
                textView.setText(s);
            }
        });
        return root;
    }
}