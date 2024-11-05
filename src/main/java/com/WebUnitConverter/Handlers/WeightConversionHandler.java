package com.WebUnitConverter.Handlers;

import com.WebUnitConverter.Singletons.Weight;
import com.WebUnitConverter.Website.PageCreator;
import com.WebUnitConverter.Website.WeightPage;

public class WeightConversionHandler extends ConversionHandler {

    @Override
    PageCreator getPage() {
        return new WeightPage();
    }

    @Override
    double convertUnit(double value, String from, String to) {
        double convertedValue = Weight.convertUnit(from, to);
        return value * convertedValue;
    }
}
