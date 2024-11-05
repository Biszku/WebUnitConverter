package Handlers;

import Singletons.Length;
import Website.LengthPage;
import Website.PageCreator;

public class LengthConversionHandler extends ConversionHandler {

    @Override
    PageCreator getPage() {
        return new LengthPage();
    }

    @Override
    double convertUnit(double value, String from, String to) {
        double convertedValue = Length.convertUnit(from, to);
        return value * convertedValue;
    }
}