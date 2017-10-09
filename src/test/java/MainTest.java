import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.assertj.core.data.Offset.offset;
import static org.junit.Assert.*;

public class MainTest {

    CalculateAllowance calculator = new CalculateAllowance();

    Child an = new Child("an", LocalDate.of(2002, 9, 6));
    Child bart = new Child("bart", LocalDate.of(2002, 9, 6));
    Child carl = new Child("carl", LocalDate.of(2002, 9, 6));
    Child dave = new Child("dave", LocalDate.of(2002, 9, 6));

//    Family familyNormal1 = new Family(true, false, false, new Child[]{an});
//    Family familyNormal2 = new Family(true, false, false, new Child[]{an, bart});
//    Family familyNormal4 = new Family(true, false, false, new Child[]{an, bart, carl, dave});
//
//    Family familyOrphan1 = new Family(false, true, false, new Child[]{an});
//    Family familyOrphan2 = new Family(false, true, false, new Child[]{an, bart});
//    Family familyOrphan4 = new Family(false, true, false, new Child[]{an, bart, carl, dave});
//
//    Family familySelf1 = new Family(false, false, true, new Child[]{an});
//    Family familySelf2 = new Family(false, false, true, new Child[]{an, bart});
//    Family familySelf4 = new Family(false, false, true, new Child[]{an, bart, carl, dave});

    Family familyUnemployed1=new Family(false,false,false,true,false,false,false,new Child[]{an});
    Family familyUnemployed2=new Family(false,false,false,true,false,false,false,new Child[]{an,bart});
    Family familyUnemployed3=new Family(false,false,false,true,false,false,false,new Child[]{an,bart,carl});
    Family familyUnemployed3SingleParent=new Family(false,false,false,true,false,false,true,new Child[]{an,bart,carl});
    Family familyUnemployed4=new Family(false,false,false,true,false,false,false,new Child[]{an,bart,carl,dave});
    Family familyDisabled1=new Family(false,false,false,false,true,true,false,new Child[]{an});
    Family familyDisabled2=new Family(false,false,false,false,true,true,false,new Child[]{an,bart});
    Family familyDisabled3=new Family(false,false,false,false,true,true,false,new Child[]{an,bart,carl});
    Family familyDisabled4=new Family(false,false,false,false,true,true,false,new Child[]{an,bart,carl,dave});
    Family familyDisabled3SingleParent=new Family(false,false,false,false,true,true,true,new Child[]{an,bart,carl});

//    @Test
//    public void normalFamilyWithOneChildAndNoAdditionsShouldReturn_92_09() throws Exception {
//        double expected = 92.09;
//        Assertions.assertThat(calculator.calculateBaseAllowance(familyNormal1)).isEqualTo(expected);
//    }
//
//    @Test
//    public void normalFamilyWithTwoChildrenAndNoAdditionsShouldReturn_262_48() throws Exception {
//        double expected = 92.09 + 170.39;
//        Assertions.assertThat(calculator.calculateBaseAllowance(familyNormal2)).isEqualTo(expected);
//    }
//
//    @Test
//    public void normalFamilyWithFourChildrenAndNoAdditionsShouldReturn_771_28() throws Exception {
//        double expected = 92.09 + 170.39 + 254.40 + 254.40;
//        Assertions.assertThat(calculator.calculateBaseAllowance(familyNormal4)).isEqualTo(expected);
//    }
//
//    @Test
//    public void orphanFamilyWithOneChildNoAdditionSHouldReturn_353_76() throws Exception {
//        double expected = 353.76;
//        Assertions.assertThat(calculator.calculateBaseAllowance(familyOrphan1)).isEqualTo(expected);
//    }
//
//    @Test
//    public void orphanFamilyWithOneChildNoAdditionSHouldReturn_353_76x2() throws Exception {
//        double expected = 353.76 * 2;
//        Assertions.assertThat(calculator.calculateBaseAllowance(familyOrphan2)).isEqualTo(expected);
//    }
//
//    @Test
//    public void orphanFamilyWithOneChildNoAdditionSHouldReturn_353_76x4() throws Exception {
//        double expected = 353.76 * 4;
//        Assertions.assertThat(calculator.calculateBaseAllowance(familyOrphan4)).isEqualTo(expected);
//    }
//
//    @Test
//    public void selfEmployedFamilyOneChildNoAdditionShouldReturn_61_79() throws Exception {
//        double expected = 61.79;
//        Assertions.assertThat(calculator.calculateBaseAllowance(familySelf1)).isEqualTo(expected);
//    }
//
//    @Test
//    public void selfEmployedFamilyTwoChildNoAdditionShouldReturn_61_79x2() throws Exception {
//        double expected = 61.79 * 2;
//        Assertions.assertThat(calculator.calculateBaseAllowance(familySelf2)).isEqualTo(expected);
//    }
//
//    @Test
//    public void selfEmployedFamilyFourChildNoAdditionShouldReturn_61_79x4() throws Exception {
//        double expected = 61.79 * 4;
//        Assertions.assertThat(calculator.calculateBaseAllowance(familySelf4)).isEqualTo(expected);
//    }
//
//    @Test
//    public void normalFamilyWithFOurChildrenHavingAge15And15ShouldReturn() throws Exception {
//        double expected =24.43+(48.88*3);
//        Assertions.assertThat(calculator.calculateAgeAdditionAllowance(familyNormal4)).isEqualTo(expected, offset(0.001));
//    }
//
//    @Test
//    public void normalFamilyWithTwoChildrenHavingAge15And15ShouldReturn() throws Exception {
//        double expected =24.43+48.88;
//        Assertions.assertThat(calculator.calculateAgeAdditionAllowance(familyNormal2)).isEqualTo(expected, offset(0.001));
//    }

    @Test
    public void unemployedOneChildShouldReturn_46_88() throws Exception {
        double expected=46.88;
        Assertions.assertThat(calculator.calculcateUnemployedPensionedAdditionAllowance(familyUnemployed1)).isEqualTo(expected, offset(0.001));
    }
    @Test
    public void unemployedTwoChildShouldReturn_46_88() throws Exception {
        double expected=46.88+29.06;
        Assertions.assertThat(calculator.calculcateUnemployedPensionedAdditionAllowance(familyUnemployed2)).isEqualTo(expected, offset(0.001));
    }
    @Test
    public void unemployedThreeChildShouldReturn_46_88() throws Exception {
        double expected=46.88+29.06+5.10;
        Assertions.assertThat(calculator.calculcateUnemployedPensionedAdditionAllowance(familyUnemployed3)).isEqualTo(expected, offset(0.001));
    }
    @Test
    public void unemployedThreeChildSingleParentShouldReturn_46_88() throws Exception {
        double expected=46.88+29.06+23.43;
        Assertions.assertThat(calculator.calculcateUnemployedPensionedAdditionAllowance(familyUnemployed3SingleParent)).isEqualTo(expected, offset(0.001));
    }
    @Test
    public void disableddOneChildShouldReturn_46_88() throws Exception {
        double expected=46.88;
        Assertions.assertThat(calculator.calculcateUnemployedPensionedAdditionAllowance(familyDisabled1)).isEqualTo(expected, offset(0.001));
    }
    @Test
    public void disabledTwoChildShouldReturn_46_88() throws Exception {
        double expected=46.88+29.06;
        Assertions.assertThat(calculator.calculcateUnemployedPensionedAdditionAllowance(familyDisabled2)).isEqualTo(expected, offset(0.001));
    }
    @Test
    public void disabledThreeChildShouldReturn_46_88() throws Exception {
        double expected=46.88+29.06+5.10;
        Assertions.assertThat(calculator.calculcateUnemployedPensionedAdditionAllowance(familyDisabled3)).isEqualTo(expected, offset(0.001));
    }
    @Test
    public void disabledThreeChildSingleParentShouldReturn_46_88() throws Exception {
        double expected=46.88+29.06+23.43;
        Assertions.assertThat(calculator.calculcateUnemployedPensionedAdditionAllowance(familyDisabled3SingleParent)).isEqualTo(expected, offset(0.001));
    }
    @Test
    public void disabledFourChildShouldReturn_46_88() throws Exception {
        double expected=46.88+29.06+5.10;
        Assertions.assertThat(calculator.calculcateUnemployedPensionedAdditionAllowance(familyDisabled4)).isEqualTo(expected, offset(0.001));
    }
    @Test
    public void unemployedFourChildShouldReturn_46_88() throws Exception {
        double expected=46.88+29.06+5.10;
        Assertions.assertThat(calculator.calculcateUnemployedPensionedAdditionAllowance(familyUnemployed4)).isEqualTo(expected, offset(0.001));
    }
}