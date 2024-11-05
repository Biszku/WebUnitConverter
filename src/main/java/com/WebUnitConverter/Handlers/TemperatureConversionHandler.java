package com.WebUnitConverter.Handlers;

import com.WebUnitConverter.Singletons.Temperature;
import com.WebUnitConverter.Website.PageCreator;
import com.WebUnitConverter.Website.TemperaturePage;

public class TemperatureConversionHandler extends ConversionHandler {

    @Override
    PageCreator getPage() {
        return new TemperaturePage();
    }

    @Override
    double convertUnit(double value, String from, String to) {
        return Temperature.convert(value, from, to);
    }
}
