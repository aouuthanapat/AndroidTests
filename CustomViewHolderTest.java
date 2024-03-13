package com.example.apiapplication;

import static org.junit.Assert.*;

import android.view.View;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CustomViewHolderTest {
    @Mock
    private View mockView;

    private CustomViewHolder viewHolder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        viewHolder = new CustomViewHolder(mockView);
    }

    @Test
    public void viewHolderBindsViews() {
        assertEquals(viewHolder.text_title, mockView.findViewById(R.id.text_title));
        assertEquals(viewHolder.text_source, mockView.findViewById(R.id.text_source));
        assertEquals(viewHolder.img_headline, mockView.findViewById(R.id.img_headline));
        assertEquals(viewHolder.cardView, mockView.findViewById(R.id.main_container));
    }
}
