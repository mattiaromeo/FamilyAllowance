import java.lang.reflect.Array;
import java.util.Arrays;

public class Family {
    private boolean isNormalFamily;
    private boolean isOrphanFamily;
    private boolean isSelfEmployedFamily;
    private boolean isUnemployedFamily;
    private boolean isPensionedFamily;
    private boolean isDisabledFamily;
    private boolean isSingleParent;
    private Child[] childrenOfFamily;

    public Family(boolean isNormalFamily, boolean isOrphanFamily, boolean isSelfEmployedFamily, boolean isUnemployedFamily, boolean isPensionedFamily, boolean isDisabledFamily, boolean isSingleParent, Child[] childrenOfFamily) {
        this.isNormalFamily = isNormalFamily;
        this.isOrphanFamily = isOrphanFamily;
        this.isSelfEmployedFamily = isSelfEmployedFamily;
        this.isUnemployedFamily = isUnemployedFamily;
        this.isPensionedFamily = isPensionedFamily;
        this.isDisabledFamily = isDisabledFamily;
        this.childrenOfFamily = childrenOfFamily;
        this.isSingleParent = isSingleParent;
    }


    public boolean isNormalFamily() {
        return isNormalFamily;
    }

    public boolean isOrphanFamily() {
        return isOrphanFamily;
    }

    public boolean isSelfEmployedFamily() {
        return isSelfEmployedFamily;
    }

    public boolean isUnemployedFamily() {
        return isUnemployedFamily;
    }

    public boolean isPensionedFamily() {
        return isPensionedFamily;
    }

    public boolean isDisabledFamily() {
        return isDisabledFamily;
    }

    public int getChildrenOfFamily() {
        return childrenOfFamily.length;
    }

    public Child[] getChildOfFamily() {
        return childrenOfFamily;
    }

    public boolean isSingleParent() {
        return isSingleParent;
    }


    //methode om array te sorten van oud naar jong maar dat is voor later :)
}
