package delivery.king.hobanwoo.jpa.domain.member.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import delivery.king.hobanwoo.jpa.domain.member.enums.MembershipTier;
import lombok.Builder;
import lombok.Getter;

@Getter
@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "membership_tier")
    @Enumerated(EnumType.STRING)
    private MembershipTier membershipTier;

    @Builder
    public Member(final String email, final String password, final String phoneNumber) {
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.membershipTier = MembershipTier.THANKS;
    }
}
