package org.schematik;

import org.schematik.data.hibernate.HibernatePlugin;

public class Main {
    public static void main(String[] args) {
        Application.initialize();

        HibernatePlugin hibernatePlugin = new HibernatePlugin();
        hibernatePlugin.register();
    }
}