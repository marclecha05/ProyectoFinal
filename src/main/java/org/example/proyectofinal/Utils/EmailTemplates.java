package org.example.proyectofinal.Utils;

public class EmailTemplates {

    public static String getBienvenidaHtml(String nombre) {
        return """
            <html>
            <head>
                <link href="https://fonts.googleapis.com/css2?family=Jura:wght@400;600&display=swap" rel="stylesheet">
                <style>
                    body { font-family: 'Jura', sans-serif; background-color: #f9f9f9; color: #333; padding: 20px; }
                    .container { max-width: 600px; margin: auto; background-color: #ffffff; border-radius: 10px;
                        border: 1px solid #ddd; box-shadow: 0 4px 10px rgba(0, 0, 0, 0.05); overflow: hidden; }
                    .header { background-color: #FF9D47; color: white; text-align: center; padding: 25px; font-size: 24px; font-weight: bold; }
                    .content { padding: 30px 20px; font-size: 16px; line-height: 1.6; }
                    .footer { background-color: #f2f2f2; text-align: center; color: #777; font-size: 12px; padding: 15px; }
                </style>
            </head>
            <body>
                <div class="container">
                    <div class="header">¡Bienvenido a Turnify!</div>
                    <div class="content">
                        <p>Hola %s,</p>
                        <p>Gracias por unirte a <strong>Turnify</strong>, tu nueva solución para gestionar reservas y citas de forma profesional.</p>
                        <p>Estamos muy felices de que formes parte de nuestra comunidad.</p>
                        <p>No dudes en explorar todas las funcionalidades de la plataforma y contactar con nosotros si tienes dudas.</p>
                    </div>
                    <div class="footer">© 2025 Turnify. Todos los derechos reservados.</div>
                </div>
            </body>
            </html>
        """.formatted(nombre);
    }

    public static String getInicioSesionHtml(String nombre) {
        return """
            <html>
            <head>
                <link href="https://fonts.googleapis.com/css2?family=Jura:wght@400;600&display=swap" rel="stylesheet">
                <style>
                    body { font-family: 'Jura', sans-serif; background-color: #f9f9f9; color: #333; padding: 20px; }
                    .container { max-width: 600px; margin: auto; background-color: #ffffff; border-radius: 10px;
                        border: 1px solid #ddd; box-shadow: 0 4px 10px rgba(0, 0, 0, 0.05); overflow: hidden; }
                    .header { background-color: #FF9D47; color: white; text-align: center; padding: 25px; font-size: 24px; font-weight: bold; }
                    .content { padding: 30px 20px; font-size: 16px; line-height: 1.6; }
                    .footer { background-color: #f2f2f2; text-align: center; color: #777; font-size: 12px; padding: 15px; }
                </style>
            </head>
            <body>
                <div class="container">
                    <div class="header">Inicio de sesión exitoso</div>
                    <div class="content">
                        <p>Hola %s,</p>
                        <p>Has iniciado sesión correctamente en <strong>Turnify</strong>.</p>
                        <p>Nos alegra verte de nuevo. Esperamos que tu experiencia en la plataforma sea excelente.</p>
                    </div>
                    <div class="footer">© 2025 Turnify. Todos los derechos reservados.</div>
                </div>
            </body>
            </html>
        """.formatted(nombre);
    }
    public static String getCuentaEliminadaHtml(String nombre) {
        return """
        <html>
        <head>
            <link href="https://fonts.googleapis.com/css2?family=Jura:wght@400;600&display=swap" rel="stylesheet">
            <style>
                body { font-family: 'Jura', sans-serif; background-color: #f9f9f9; color: #333; padding: 20px; }
                .container { max-width: 600px; margin: auto; background-color: #ffffff; border-radius: 10px;
                    border: 1px solid #ddd; box-shadow: 0 4px 10px rgba(0, 0, 0, 0.05); overflow: hidden; }
                .header { background-color: #D94D4D; color: white; text-align: center; padding: 25px; font-size: 24px; font-weight: bold; }
                .content { padding: 30px 20px; font-size: 16px; line-height: 1.6; }
                .footer { background-color: #f2f2f2; text-align: center; color: #777; font-size: 12px; padding: 15px; }
            </style>
        </head>
        <body>
            <div class="container">
                <div class="header">Cuenta eliminada</div>
                <div class="content">
                    <p>Hola %s,</p>
                    <p>Te confirmamos que tu cuenta ha sido eliminada exitosamente de <strong>Turnify</strong>.</p>
                    <p>Gracias por haber sido parte de nuestra comunidad. Esperamos volver a verte pronto.</p>
                </div>
                <div class="footer">© 2025 Turnify. Todos los derechos reservados.</div>
            </div>
        </body>
        </html>
    """.formatted(nombre);
    }

}
