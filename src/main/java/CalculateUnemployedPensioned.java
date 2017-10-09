public class CalculateUnemployedPensioned {
    public double calculateUnemployedPensionedAllowance(Family family) {
        double totalUnemployedPensioned = 0;
        if (family.isUnemployedFamily() == true || family.isPensionedFamily() == true) {
            Child[] localChildrenArray = family.getChildOfFamily();
            for (int i = 0; i < family.getChildrenOfFamily(); i++) {
                if (i == 0) {
                    totalUnemployedPensioned += 46.88;
                } else if (i == 1) {
                    totalUnemployedPensioned += 29.06;
                } else if (i == 2 && family.isSingleParent() == true) {
                    totalUnemployedPensioned += 23.43;
                } else if (i == 2) {
                    totalUnemployedPensioned += 5.10;
                }
            }
        }

        return totalUnemployedPensioned;


    }
}
