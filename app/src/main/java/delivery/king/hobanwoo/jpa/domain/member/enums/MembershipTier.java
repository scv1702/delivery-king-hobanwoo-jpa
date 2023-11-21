package delivery.king.hobanwoo.jpa.domain.member.enums;

public enum MembershipTier {
    THANKS("고마워요"), LOVEYOU("사랑해요"), GREAT("최고예요");

    private String value;

    MembershipTier(String value) {
        this.value = value;
    }

    public String toValue() {
        return this.value;
    }
}
