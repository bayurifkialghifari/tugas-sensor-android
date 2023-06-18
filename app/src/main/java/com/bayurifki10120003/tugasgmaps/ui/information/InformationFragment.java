/**
 *
 * Nama : Bayu Rifki Alghifari
 * Nim : 10120003
 * Kelas : IF 1
 * Email : bayurifkialgh@gmail.com
 *
 */
package com.bayurifki10120003.tugasgmaps.ui.information;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.bayurifki10120003.tugasgmaps.databinding.InformationBinding;

public class InformationFragment extends Fragment {

    private InformationBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = InformationBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}