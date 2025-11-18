export interface Queue<T> {
    enqueue(item: T): void;
    dequeue(): T | undefined;
    peek(): T | undefined;
    isEmpty(): boolean;
    size(): number;
    reverse(): void;
    generateBinaryNumbers(n: number): string[];
    simulateHospitalTriage(patients: { name: string; priority: number }[]): string[];
    implementStackUsingQueues(): void;
    simulateCircularBuffer(size: number): void;
}

export class QueueImpl<T> implements Queue<T> {
    private items: T[] = [];

    enqueue(item: T): void {
        this.items.push(item);
    }

    dequeue(): T | undefined {
        return this.items.shift();
    }

    peek(): T | undefined {
        return this.items[0];
    }

    isEmpty(): boolean {
        return this.items.length === 0;
    }

    size(): number {
        return this.items.length;
    }

    reverse(): void {
        this.items.reverse();
    }

    generateBinaryNumbers(n: number): string[] {
        const result: string[] = [];
        for (let i = 0; i < Math.pow(2, n); i++) {
            result.push(i.toString(2).padStart(n, '0'));
        }
        return result;
    }

    simulateHospitalTriage(patients: { name: string; priority: number }[]): string[] {
        const sortedPatients = patients.sort((a, b) => b.priority - a.priority);
        return sortedPatients.map(patient => patient.name);
    }

    implementStackUsingQueues(): void {
        // Implementation logic for stack using two queues can be added here
    }

    simulateCircularBuffer(size: number): void {
        // Implementation logic for circular buffer can be added here
    }
}