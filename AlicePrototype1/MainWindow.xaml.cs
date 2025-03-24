using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using AlicePrototype1.Views;

namespace AlicePrototype1
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void ListViewItem_MouseUp(object sender, MouseEventArgs e)
        {
            if (sender is ListViewItem item)
            {
                // Busca o StackPanel dentro do ListViewItem
                if (item.Content is StackPanel stackPanel)
                {
                    // Procura o primeiro TextBlock dentro do StackPanel
                    var textBlock = stackPanel.Children.OfType<TextBlock>().FirstOrDefault();

                    if (textBlock != null)
                    {
                        switch (textBlock.Text)
                        {
                            case "View Alice":
                                MainContent.Content = new ViewAlice();
                                break;
                            case "Audio":
                                MessageBox.Show("Tela de Chat ainda não implementada!");
                                break;
                            case "Chat":
                                MessageBox.Show("Tela de Chat ainda não implementada!");
                                break;
                        }
                    }
                }
            }
        }
    }
}