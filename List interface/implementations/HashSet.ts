class HashSet<T> {
    private items: { [key: string]: boolean } = {};

    add(value: T): void {
        const key = this.getKey(value);
        this.items[key] = true;
    }

    remove(value: T): void {
        const key = this.getKey(value);
        delete this.items[key];
    }

    contains(value: T): boolean {
        const key = this.getKey(value);
        return this.items.hasOwnProperty(key);
    }

    size(): number {
        return Object.keys(this.items).length;
    }

    clear(): void {
        this.items = {};
    }

    union(otherSet: HashSet<T>): HashSet<T> {
        const unionSet = new HashSet<T>();
        for (const key in this.items) {
            unionSet.add(this.getValue(key));
        }
        for (const key in otherSet.items) {
            unionSet.add(otherSet.getValue(key));
        }
        return unionSet;
    }

    intersection(otherSet: HashSet<T>): HashSet<T> {
        const intersectionSet = new HashSet<T>();
        for (const key in this.items) {
            if (otherSet.contains(this.getValue(key))) {
                intersectionSet.add(this.getValue(key));
            }
        }
        return intersectionSet;
    }

    difference(otherSet: HashSet<T>): HashSet<T> {
        const differenceSet = new HashSet<T>();
        for (const key in this.items) {
            if (!otherSet.contains(this.getValue(key))) {
                differenceSet.add(this.getValue(key));
            }
        }
        return differenceSet;
    }

    isSubset(otherSet: HashSet<T>): boolean {
        for (const key in this.items) {
            if (!otherSet.contains(this.getValue(key))) {
                return false;
            }
        }
        return true;
    }

    private getKey(value: T): string {
        return JSON.stringify(value);
    }

    private getValue(key: string): T {
        return JSON.parse(key);
    }
}