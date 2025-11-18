# Data Structures Assignment

This project implements various data structures and management systems using TypeScript. It includes interfaces for List, Set, and Queue, along with their concrete implementations. Additionally, it features systems for Insurance Policy Management and E-Commerce Order Processing.

## Project Structure

```
data-structures-assignment
├── src
│   ├── interfaces
│   │   ├── List.ts
│   │   ├── Set.ts
│   │   └── Queue.ts
│   ├── implementations
│   │   ├── ArrayList.ts
│   │   ├── LinkedList.ts
│   │   ├── HashSet.ts
│   │   └── QueueImpl.ts
│   ├── systems
│   │   ├── InsurancePolicyManagement.ts
│   │   ├── ECommerceOrderProcessing.ts
│   │   └── index.ts
│   └── utils
│       └── index.ts
├── tests
│   ├── interfaces.test.ts
│   ├── implementations.test.ts
│   └── systems.test.ts
├── package.json
├── tsconfig.json
└── README.md
```

## Setup Instructions

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd data-structures-assignment
   ```

2. **Install dependencies**:
   ```
   npm install
   ```

3. **Compile the TypeScript files**:
   ```
   npm run build
   ```

4. **Run tests**:
   ```
   npm test
   ```

## Usage Examples

### List Interface
- Use `ArrayList` or `LinkedList` to create a list and perform operations like reversing, finding frequency, and removing duplicates.

### Set Interface
- Use `HashSet` to create a set and perform operations like union, intersection, and checking for subsets.

### Queue Interface
- Use `QueueImpl` to create a queue and perform operations like reversing, generating binary numbers, and simulating a hospital triage system.

### Systems
- Utilize `InsurancePolicyManagement` for managing insurance policies.
- Utilize `ECommerceOrderProcessing` for handling e-commerce orders.

## Contributing

Feel free to submit issues or pull requests for improvements or additional features.