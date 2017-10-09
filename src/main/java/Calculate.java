public interface Calculate {
    double calculateBaseAllowance(Family family);
    double calculateAgeAdditionAllowance(Family family);
    double calculcateUnemployedPensionedAdditionAllowance(Family family);
    double calculateDisabledAdditionAllowance(Family family);
}
