export class InsurancePolicy {
    constructor(
        public policyNumber: string,
        public policyHolderName: string,
        public coverageAmount: number,
        public premium: number,
        public startDate: Date,
        public endDate: Date
    ) {}
}

export class InsurancePolicyManagement {
    private policies: InsurancePolicy[] = [];

    addPolicy(policy: InsurancePolicy): void {
        this.policies.push(policy);
    }

    getPolicy(policyNumber: string): InsurancePolicy | undefined {
        return this.policies.find(policy => policy.policyNumber === policyNumber);
    }

    removePolicy(policyNumber: string): boolean {
        const index = this.policies.findIndex(policy => policy.policyNumber === policyNumber);
        if (index !== -1) {
            this.policies.splice(index, 1);
            return true;
        }
        return false;
    }

    comparePolicies(policyNumber1: string, policyNumber2: string): boolean {
        const policy1 = this.getPolicy(policyNumber1);
        const policy2 = this.getPolicy(policyNumber2);
        if (policy1 && policy2) {
            return policy1.coverageAmount === policy2.coverageAmount &&
                   policy1.premium === policy2.premium &&
                   policy1.startDate.getTime() === policy2.startDate.getTime() &&
                   policy1.endDate.getTime() === policy2.endDate.getTime();
        }
        return false;
    }

    listPolicies(): InsurancePolicy[] {
        return this.policies;
    }
}