public class CalculateBase {

    public double calculateBaseAllowance(Family family) {
        double firstNormalChild = 92.09;
        double secondNormalChild = 170.39;
        double thirdOrMoreNormalChild = 254.40;
        double orphandChild = 353.76;
        double selfEmployedChild = 61.79;
        double totalbase = 0;
        if (family.isNormalFamily() == true) {
            if (family.getChildrenOfFamily() == 1) {
                return firstNormalChild;
            } else if (family.getChildrenOfFamily() == 2) {
                return firstNormalChild + secondNormalChild;
            } else {
                return ((family.getChildrenOfFamily() - 2) * thirdOrMoreNormalChild) + firstNormalChild + secondNormalChild;
            }
        } else if (family.isOrphanFamily() == true) {
            return orphandChild * family.getChildrenOfFamily();
        } else if (family.isSelfEmployedFamily() == true) {
            return selfEmployedChild * family.getChildrenOfFamily();
        }
        return totalbase;
    }
}