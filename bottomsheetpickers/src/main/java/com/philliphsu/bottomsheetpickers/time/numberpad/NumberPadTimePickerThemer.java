package com.philliphsu.bottomsheetpickers.time.numberpad;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;


/**
 * APIs to set the colors of a {@link NumberPadTimePicker}.
 */
interface NumberPadTimePickerThemer {
    NumberPadTimePickerThemer setInputTimeTextColor(int color);

    NumberPadTimePickerThemer setInputAmPmTextColor(int color);

    NumberPadTimePickerThemer setBackspaceTint(ColorStateList colors);

    NumberPadTimePickerThemer setNumberKeysTextColor(ColorStateList colors);

    NumberPadTimePickerThemer setAltKeysTextColor(ColorStateList colors);

    NumberPadTimePickerThemer setHeaderBackground(Drawable background);

    NumberPadTimePickerThemer setNumberPadBackground(Drawable background);

    NumberPadTimePickerThemer setDivider(Drawable divider);
}
