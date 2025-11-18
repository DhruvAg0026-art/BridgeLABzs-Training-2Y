class ArrayList<T> implements List<T> {
    private items: T[];

    constructor() {
        this.items = [];
    }

    add(item: T): void {
        this.items.push(item);
    }

    remove(item: T): boolean {
        const index = this.items.indexOf(item);
        if (index > -1) {
            this.items.splice(index, 1);
            return true;
        }
        return false;
    }

    get(index: number): T | undefined {
        return this.items[index];
    }

    size(): number {
        return this.items.length;
    }

    reverse(): void {
        this.items.reverse();
    }

    frequency(item: T): number {
        return this.items.filter(i => i === item).length;
    }

    rotate(positions: number): void {
        const length = this.items.length;
        positions = positions % length;
        this.items = this.items.slice(-positions).concat(this.items.slice(0, length - positions));
    }

    removeDuplicates(): void {
        this.items = Array.from(new Set(this.items));
    }

    nthFromEnd(n: number): T | undefined {
        if (n <= 0 || n > this.size()) {
            return undefined;
        }
        return this.items[this.size() - n];
    }
}