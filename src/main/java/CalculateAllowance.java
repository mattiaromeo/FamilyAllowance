public class CalculateAllowance implements  Calculate{
    public void calculateAllowanceForFamily(Family family){
        double totalAllowance=0;
        totalAllowance+=calculateBaseAllowance(family);
        totalAllowance+=calculateAgeAdditionAllowance(family);
        totalAllowance+=calculcateUnemployedPensionedAdditionAllowance(family);
        totalAllowance+=calculateDisabledAdditionAllowance(family);
        System.out.println("the total allowance for family ... is "+totalAllowance);
    }

    @Override
    public double calculateBaseAllowance(Family family) {
        CalculateBase basecalculator=new CalculateBase();
        return basecalculator.calculateBaseAllowance(family);
    }

    @Override
    public double calculateAgeAdditionAllowance(Family family) {
        CalculateAge agecalculator=new CalculateAge();
        return agecalculator.calculateAgeAdditionAllowance(family);
    }

    @Override
    public double calculcateUnemployedPensionedAdditionAllowance(Family family) {
        CalculateUnemployedPensioned unemployedPensionedCalculator= new CalculateUnemployedPensioned();
        return unemployedPensionedCalculator.calculateUnemployedPensionedAllowance(family);
    }

    @Override
    public double calculateDisabledAdditionAllowance(Family family) {
        return 0;
    }

}
