export interface Set<T> {
    equals(otherSet: Set<T>): boolean;
    union(otherSet: Set<T>): Set<T>;
    intersection(otherSet: Set<T>): Set<T>;
    symmetricDifference(otherSet: Set<T>): Set<T>;
    toSortedList(): T[];
    isSubset(otherSet: Set<T>): boolean;
}