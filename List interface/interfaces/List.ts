export interface List<T> {
    reverse(): void;
    frequency(element: T): number;
    rotate(positions: number): void;
    removeDuplicates(): void;
    nthFromEnd(n: number): T | undefined;
}