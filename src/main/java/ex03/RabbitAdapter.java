package ex03;

import ex03.lib.OuterRabit;

public class RabbitAdapter extends Animal{
    private OuterRabit outerRabit;

    public RabbitAdapter(OuterRabit outerRabit) {
        this.outerRabit = outerRabit;
    }

    @Override
    public String getName() {
        return outerRabit.getFullname();
    }
}
