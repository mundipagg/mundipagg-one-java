package EnumTypes;

/**
 * Enumerador para status de transação de débito online
 */
public enum OnlineDebitTransactionStatusEnum {
        
        /**
         * Inválido
         */
        Invalid,

        /**
         * Não encontrado
         */
        NotFound,

        /**
         * Não pago
         */
        NotPaid,

        /**
         * Aberto pendendo pagamento
         */
        OpenedPendingPayment,

        /**
         * Pago a maior
         */
        OverPaid,

        /**
         * Pago
         */
        Paid,

        /**
         * Indefinido
         */
        Undefined,

        /**
         * Pago a menor
         */
        UnderPaid,

        /**
         * Com erro
         */
        WithError
}
