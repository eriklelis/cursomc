package com.eriklelis.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.eriklelis.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}