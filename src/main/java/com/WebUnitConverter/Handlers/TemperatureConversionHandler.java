package Handlers;

import Singletons.Temperature;
import Website.PageCreator;
import Website.TemperaturePage;

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