public class CalculateAge {

    public double calculateAgeAdditionAllowance(Family family) {
        double totalAgeAddition = 0;
        Child[] localChildrenArray = family.getChildOfFamily();
        for (int i = 0; i < family.getChildrenOfFamily(); i++) {
            if (localChildrenArray[i].getAge(localChildrenArray[i]) > 5 && localChildrenArray[i].getAge(localChildrenArray[i]) < 12) {
                if (i == 0) {
                    totalAgeAddition += 16.04;
                } else {
                    totalAgeAddition += 31.99;
                }
            } else if (localChildrenArray[i].getAge(localChildrenArray[i]) > 11 && localChildrenArray[i].getAge(localChildrenArray[i]) < 18) {
                if (i == 0) {
                    totalAgeAddition += 24.43;
                } else {
                    totalAgeAddition += 48.88;
                }
            } else if (localChildrenArray[i].getAge(localChildrenArray[i]) > 18) {
                if (i == 0) {
                    totalAgeAddition += 28.16;
                } else {
                    totalAgeAddition += 62.15;
                }
            }
        }
        return totalAgeAddition;

    }
}
