export interface Queue<T> {
    enqueue(item: T): void;
    dequeue(): T | undefined;
    isEmpty(): boolean;
    size(): number;
    reverse(): void;
    generateBinaryNumbers(n: number): string[];
    simulateHospitalTriage(patients: { name: string; priority: number }[]): string[];
    implementStackUsingQueues(): { push(item: T): void; pop(): T | undefined; };
    simulateCircularBuffer(size: number): { add(item: T): void; get(index: number): T | undefined; };
}