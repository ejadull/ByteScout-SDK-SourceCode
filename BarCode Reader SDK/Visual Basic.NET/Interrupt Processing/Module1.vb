'*******************************************************************
'       ByteScout BarCode Reader SDK
'                                                                   
'       Copyright © 2016 Bytescout, http://www.bytescout.com        
'       ALL RIGHTS RESERVED                                         
'                                                                   
'*******************************************************************

Imports System.IO

Imports Bytescout.BarCodeReader

Module Module1

    Sub Main()

        Const imageFile As String = "1d_barcodes.pdf"

        Console.WriteLine("Reading barcode(s) from image {0}", Path.GetFullPath(imageFile))

        Dim reader As New Reader()
        reader.RegistrationName = "demo"
		reader.RegistrationKey = "demo"

        ' Set barcode type to find
        reader.BarcodeTypesToFind.All1D = True

        AddHandler reader.BarcodeFound, AddressOf Reader_BarcodeFound

        ' Read barcodes
        reader.ReadFrom(imageFile)

        Console.WriteLine("Press any key to exit..")
        Console.ReadKey()

    End Sub

    Private Sub Reader_BarcodeFound(ByVal sender As Object, ByVal e As BarcodeFoundEventArgs)

        Console.WriteLine("Found barcode with type '{0}' and value '{1}'", e.Barcode.Type, e.Barcode.Value)

        If e.Count = 5 Then
            ' Cancel after 5 barcodes found
            e.Cancel = True
            Console.WriteLine("Cancelled.")
        End If

    End Sub

End Module
