export class Order {
    constructor(public id: number, public product: string, public quantity: number, public price: number) {}
}

export class ECommerceOrderProcessing {
    private orders: Order[] = [];

    addOrder(order: Order): void {
        this.orders.push(order);
    }

    removeOrder(orderId: number): void {
        this.orders = this.orders.filter(order => order.id !== orderId);
    }

    getOrders(): Order[] {
        return this.orders;
    }

    processOrders(): void {
        this.orders.forEach(order => {
            console.log(`Processing order ID: ${order.id}, Product: ${order.product}, Quantity: ${order.quantity}, Total Price: ${order.price * order.quantity}`);
        });
    }

    removeDuplicateOrders(): void {
        const uniqueOrders = new Map<number, Order>();
        this.orders.forEach(order => {
            if (!uniqueOrders.has(order.id)) {
                uniqueOrders.set(order.id, order);
            }
        });
        this.orders = Array.from(uniqueOrders.values());
    }
}