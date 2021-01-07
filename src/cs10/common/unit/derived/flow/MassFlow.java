package cs10.common.unit.derived.flow;

import cs10.common.unit.Unit;
import cs10.common.unit.derived.energy.Enthalpy;
import cs10.common.unit.derived.power.Power;

public class MassFlow extends Unit {

    public MassFlow(){}

    public MassFlow(double value){
        setValue(value);
    }

    public MassFlow(Power power, Enthalpy work){
        this(power.getInKiloWatt().getValue() / work.getValue());
    }

    @Override
    public String getAbbreviation() {
        return "kg/s";
    }

    @Override
    public char getIdentifier() {
        return 'M';
    }

    @Override
    public String toString() {
        return getIdentifier() + " = " + getValue() + " " + getAbbreviation();
    }
}