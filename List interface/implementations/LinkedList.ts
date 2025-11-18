class Node<T> {
    value: T;
    next: Node<T> | null;

    constructor(value: T) {
        this.value = value;
        this.next = null;
    }
}

export class LinkedList<T> {
    private head: Node<T> | null;
    private size: number;

    constructor() {
        this.head = null;
        this.size = 0;
    }

    // Method to add an element at the end of the list
    add(value: T): void {
        const newNode = new Node(value);
        if (!this.head) {
            this.head = newNode;
        } else {
            let current = this.head;
            while (current.next) {
                current = current.next;
            }
            current.next = newNode;
        }
        this.size++;
    }

    // Method to reverse the linked list
    reverse(): void {
        let prev: Node<T> | null = null;
        let current = this.head;
        let next: Node<T> | null = null;

        while (current) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.head = prev;
    }

    // Method to find the frequency of elements
    frequency(value: T): number {
        let count = 0;
        let current = this.head;

        while (current) {
            if (current.value === value) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    // Method to rotate the linked list
    rotate(k: number): void {
        if (!this.head || k <= 0) return;

        let current = this.head;
        let length = 1;

        while (current.next) {
            current = current.next;
            length++;
        }

        k = k % length;
        if (k === 0) return;

        current.next = this.head; // Make it circular
        let stepsToNewHead = length - k;
        let newTail = this.head;

        for (let i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next!;
        }

        this.head = newTail.next;
        newTail.next = null; // Break the circular link
    }

    // Method to remove duplicates while preserving order
    removeDuplicates(): void {
        const seen = new Set<T>();
        let current = this.head;
        let prev: Node<T> | null = null;

        while (current) {
            if (seen.has(current.value)) {
                prev!.next = current.next; // Remove current node
            } else {
                seen.add(current.value);
                prev = current;
            }
            current = current.next;
        }
    }

    // Method to find the Nth element from the end
    findNthFromEnd(n: number): T | null {
        let mainPtr: Node<T> | null = this.head;
        let refPtr: Node<T> | null = this.head;

        let count = 0;
        if (this.head) {
            while (count < n) {
                if (!refPtr) return null; // n is greater than the size of the list
                refPtr = refPtr.next;
                count++;
            }

            while (refPtr) {
                mainPtr = mainPtr!.next;
                refPtr = refPtr.next;
            }
        }
        return mainPtr ? mainPtr.value : null;
    }

    // Method to get the size of the linked list
    getSize(): number {
        return this.size;
    }
}