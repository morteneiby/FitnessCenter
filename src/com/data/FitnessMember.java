package com.data;

public class FitnessMember extends FitnessPeople {
    String typesOfMembership;
    int membershipCost;

    public FitnessMember(String name, String cpr, String typesOfMembership, int membershipCost) {
        super(name, cpr);
        this.typesOfMembership = typesOfMembership;
        this.membershipCost = membershipCost;
    }

    public String getTypesOfMembership() {
        return typesOfMembership;
    }

    public void setTypesOfMembership(String typesOfMembership) {
        this.typesOfMembership = typesOfMembership;
    }

    public int getMembershipCost() {
        return membershipCost;
    }

    public void setMembershipCost(int membershipCost) {
        this.membershipCost = membershipCost;
    }

    @Override
    public String toString() {
        return name + "    " + cpr + "    " + typesOfMembership + "    " + membershipCost;

    }
}
