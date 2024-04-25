interface Gateway {
  apiUrl: string;
}

declare const __GATEWAY__: Gateway;
const gateway: Gateway = __GATEWAY__;

export { gateway };
